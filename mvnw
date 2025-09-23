#!/bin/sh

# Find Maven
if [ -n "$MAVEN_HOME" ]; then
    MAVEN_EXEC="$MAVEN_HOME/bin/mvn"
elif command -v mvn >/dev/null 2>&1; then
    MAVEN_EXEC="mvn"
else
    echo "Error: Maven not found. Please install Maven or set MAVEN_HOME"
    exit 1
fi

# Execute Maven with all arguments
exec "$MAVEN_EXEC" "$@"
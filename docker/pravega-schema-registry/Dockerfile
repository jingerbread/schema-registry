#
# Copyright (c) Dell Inc., or its subsidiaries. All Rights Reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
FROM openjdk:8u212-jre-alpine3.9

RUN apk add --update \
    rpcbind \
    curl \
    gcompat \
    python \
    jq \

  && rm -rf /var/cache/apk/*

EXPOSE 9092 

WORKDIR /opt/schema-registry

COPY pravega-schema-registry/ /opt/schema-registry/
COPY scripts/ /opt/schema-registry/scripts/
RUN chmod +x -R /opt/schema-registry/scripts/

ENTRYPOINT [ "/opt/schema-registry/scripts/entrypoint.sh" ]

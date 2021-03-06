/**
 * Copyright (c) Dell Inc., or its subsidiaries. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package io.pravega.schemaregistry.serializer.shared.impl;

import io.pravega.client.stream.Serializer;

import java.nio.ByteBuffer;

abstract class BaseSerializer<T> implements Serializer<T> {
    @Override
    public final T deserialize(ByteBuffer serializedValue) {
        throw new UnsupportedOperationException();
    }
}

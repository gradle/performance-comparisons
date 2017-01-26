package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_17 {
    private final Production34_17 production = new Production34_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
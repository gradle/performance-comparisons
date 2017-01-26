package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_17 {
    private final Production9_17 production = new Production9_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
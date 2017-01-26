package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_17 {
    private final Production67_17 production = new Production67_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
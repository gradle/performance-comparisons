package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_284 {
    private final Production44_284 production = new Production44_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
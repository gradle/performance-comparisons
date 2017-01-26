package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_271 {
    private final Production44_271 production = new Production44_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
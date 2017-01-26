package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_424 {
    private final Production3_424 production = new Production3_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_424 {
    private final Production50_424 production = new Production50_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
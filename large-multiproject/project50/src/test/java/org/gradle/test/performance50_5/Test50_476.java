package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_476 {
    private final Production50_476 production = new Production50_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
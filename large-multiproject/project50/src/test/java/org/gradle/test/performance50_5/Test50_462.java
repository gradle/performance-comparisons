package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_462 {
    private final Production50_462 production = new Production50_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
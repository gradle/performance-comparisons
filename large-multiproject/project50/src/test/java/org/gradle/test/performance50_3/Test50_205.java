package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_205 {
    private final Production50_205 production = new Production50_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
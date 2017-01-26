package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_19 {
    private final Production50_19 production = new Production50_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
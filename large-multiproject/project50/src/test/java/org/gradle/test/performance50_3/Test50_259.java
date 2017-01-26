package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_259 {
    private final Production50_259 production = new Production50_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
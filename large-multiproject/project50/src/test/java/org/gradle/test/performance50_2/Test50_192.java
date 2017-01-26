package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_192 {
    private final Production50_192 production = new Production50_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
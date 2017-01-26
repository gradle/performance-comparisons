package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_114 {
    private final Production50_114 production = new Production50_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
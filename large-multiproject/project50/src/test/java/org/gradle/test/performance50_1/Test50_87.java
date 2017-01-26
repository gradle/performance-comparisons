package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_87 {
    private final Production50_87 production = new Production50_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
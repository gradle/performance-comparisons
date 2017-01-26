package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_145 {
    private final Production50_145 production = new Production50_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
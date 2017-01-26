package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_218 {
    private final Production50_218 production = new Production50_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
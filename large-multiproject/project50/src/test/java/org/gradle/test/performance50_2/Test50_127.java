package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_127 {
    private final Production50_127 production = new Production50_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
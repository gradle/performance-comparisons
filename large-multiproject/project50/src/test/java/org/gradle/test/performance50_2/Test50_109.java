package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_109 {
    private final Production50_109 production = new Production50_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
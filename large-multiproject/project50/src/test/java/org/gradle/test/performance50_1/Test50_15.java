package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_15 {
    private final Production50_15 production = new Production50_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
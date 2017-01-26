package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_137 {
    private final Production50_137 production = new Production50_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
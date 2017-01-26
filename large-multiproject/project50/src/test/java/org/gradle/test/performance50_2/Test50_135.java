package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_135 {
    private final Production50_135 production = new Production50_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
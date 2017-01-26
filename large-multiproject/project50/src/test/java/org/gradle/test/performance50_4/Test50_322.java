package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_322 {
    private final Production50_322 production = new Production50_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_324 {
    private final Production50_324 production = new Production50_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
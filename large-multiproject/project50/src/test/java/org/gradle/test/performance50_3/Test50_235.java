package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_235 {
    private final Production50_235 production = new Production50_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
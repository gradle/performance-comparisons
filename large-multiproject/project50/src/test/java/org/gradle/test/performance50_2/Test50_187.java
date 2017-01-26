package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_187 {
    private final Production50_187 production = new Production50_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
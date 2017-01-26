package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_158 {
    private final Production50_158 production = new Production50_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
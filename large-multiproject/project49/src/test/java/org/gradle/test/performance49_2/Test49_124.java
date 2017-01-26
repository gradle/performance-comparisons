package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_124 {
    private final Production49_124 production = new Production49_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
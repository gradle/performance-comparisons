package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_149 {
    private final Production49_149 production = new Production49_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
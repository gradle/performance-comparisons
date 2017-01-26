package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_125 {
    private final Production49_125 production = new Production49_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
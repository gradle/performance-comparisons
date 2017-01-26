package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_103 {
    private final Production49_103 production = new Production49_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
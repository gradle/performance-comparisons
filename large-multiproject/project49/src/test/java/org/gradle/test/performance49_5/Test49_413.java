package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_413 {
    private final Production49_413 production = new Production49_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
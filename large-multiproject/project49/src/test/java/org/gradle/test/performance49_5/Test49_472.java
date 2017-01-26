package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_472 {
    private final Production49_472 production = new Production49_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
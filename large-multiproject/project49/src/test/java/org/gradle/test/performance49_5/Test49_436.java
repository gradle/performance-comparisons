package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_436 {
    private final Production49_436 production = new Production49_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
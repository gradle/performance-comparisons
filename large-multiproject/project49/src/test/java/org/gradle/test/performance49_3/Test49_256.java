package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_256 {
    private final Production49_256 production = new Production49_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
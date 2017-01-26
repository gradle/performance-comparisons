package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_377 {
    private final Production49_377 production = new Production49_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
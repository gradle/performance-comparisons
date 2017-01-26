package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_158 {
    private final Production49_158 production = new Production49_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
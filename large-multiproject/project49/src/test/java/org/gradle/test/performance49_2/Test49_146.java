package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_146 {
    private final Production49_146 production = new Production49_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
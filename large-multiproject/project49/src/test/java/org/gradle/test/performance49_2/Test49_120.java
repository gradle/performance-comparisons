package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_120 {
    private final Production49_120 production = new Production49_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
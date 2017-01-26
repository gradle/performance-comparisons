package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_122 {
    private final Production49_122 production = new Production49_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
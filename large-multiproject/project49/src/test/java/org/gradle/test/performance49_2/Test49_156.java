package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_156 {
    private final Production49_156 production = new Production49_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
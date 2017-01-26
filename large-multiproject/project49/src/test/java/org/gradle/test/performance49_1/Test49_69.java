package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_69 {
    private final Production49_69 production = new Production49_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
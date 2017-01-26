package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_16 {
    private final Production49_16 production = new Production49_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
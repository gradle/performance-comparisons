package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_152 {
    private final Production49_152 production = new Production49_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
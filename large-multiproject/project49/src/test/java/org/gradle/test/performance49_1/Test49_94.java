package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_94 {
    private final Production49_94 production = new Production49_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
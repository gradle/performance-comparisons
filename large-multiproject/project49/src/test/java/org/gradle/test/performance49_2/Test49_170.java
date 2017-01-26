package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_170 {
    private final Production49_170 production = new Production49_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
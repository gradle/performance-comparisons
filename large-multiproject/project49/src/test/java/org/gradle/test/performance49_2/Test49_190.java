package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_190 {
    private final Production49_190 production = new Production49_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
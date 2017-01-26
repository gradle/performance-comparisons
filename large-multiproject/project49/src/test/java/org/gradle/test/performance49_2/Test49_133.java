package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_133 {
    private final Production49_133 production = new Production49_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
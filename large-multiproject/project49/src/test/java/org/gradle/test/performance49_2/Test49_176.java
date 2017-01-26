package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_176 {
    private final Production49_176 production = new Production49_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
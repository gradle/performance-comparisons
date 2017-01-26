package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_179 {
    private final Production49_179 production = new Production49_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_410 {
    private final Production49_410 production = new Production49_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
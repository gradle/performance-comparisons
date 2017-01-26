package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_311 {
    private final Production49_311 production = new Production49_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
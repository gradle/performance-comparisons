package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_142 {
    private final Production49_142 production = new Production49_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
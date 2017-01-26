package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_182 {
    private final Production49_182 production = new Production49_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_161 {
    private final Production16_161 production = new Production16_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
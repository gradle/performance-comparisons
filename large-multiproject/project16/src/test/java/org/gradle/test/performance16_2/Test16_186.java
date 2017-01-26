package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_186 {
    private final Production16_186 production = new Production16_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
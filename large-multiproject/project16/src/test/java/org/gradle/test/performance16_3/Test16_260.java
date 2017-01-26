package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_260 {
    private final Production16_260 production = new Production16_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
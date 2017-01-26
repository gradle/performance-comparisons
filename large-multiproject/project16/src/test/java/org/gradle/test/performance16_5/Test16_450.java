package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_450 {
    private final Production16_450 production = new Production16_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
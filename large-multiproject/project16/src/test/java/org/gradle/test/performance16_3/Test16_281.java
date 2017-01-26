package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_281 {
    private final Production16_281 production = new Production16_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
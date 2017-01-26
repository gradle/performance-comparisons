package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_329 {
    private final Production16_329 production = new Production16_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
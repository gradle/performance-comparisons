package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_222 {
    private final Production16_222 production = new Production16_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
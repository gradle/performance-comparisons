package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_297 {
    private final Production16_297 production = new Production16_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
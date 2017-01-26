package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_320 {
    private final Production16_320 production = new Production16_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
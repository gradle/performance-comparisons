package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_305 {
    private final Production16_305 production = new Production16_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
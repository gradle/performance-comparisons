package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_362 {
    private final Production16_362 production = new Production16_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
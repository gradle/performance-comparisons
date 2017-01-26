package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_361 {
    private final Production16_361 production = new Production16_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
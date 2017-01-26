package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_227 {
    private final Production16_227 production = new Production16_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_326 {
    private final Production16_326 production = new Production16_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
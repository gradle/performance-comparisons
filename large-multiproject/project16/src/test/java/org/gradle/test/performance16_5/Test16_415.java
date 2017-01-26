package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_415 {
    private final Production16_415 production = new Production16_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
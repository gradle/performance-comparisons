package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_2 {
    private final Production16_2 production = new Production16_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_8 {
    private final Production16_8 production = new Production16_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
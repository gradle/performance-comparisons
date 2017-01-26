package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_58 {
    private final Production16_58 production = new Production16_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
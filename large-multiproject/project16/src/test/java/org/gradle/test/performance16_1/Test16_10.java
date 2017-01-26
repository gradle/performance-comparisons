package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_10 {
    private final Production16_10 production = new Production16_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
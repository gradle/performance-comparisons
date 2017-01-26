package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_364 {
    private final Production16_364 production = new Production16_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
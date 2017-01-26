package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_35 {
    private final Production16_35 production = new Production16_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
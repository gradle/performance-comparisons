package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_251 {
    private final Production16_251 production = new Production16_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
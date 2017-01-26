package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_392 {
    private final Production16_392 production = new Production16_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
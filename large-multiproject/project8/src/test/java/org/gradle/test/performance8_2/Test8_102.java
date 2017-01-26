package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_102 {
    private final Production8_102 production = new Production8_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
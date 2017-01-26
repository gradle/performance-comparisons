package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_102 {
    private final Production98_102 production = new Production98_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
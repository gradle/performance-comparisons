package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_102 {
    private final Production93_102 production = new Production93_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
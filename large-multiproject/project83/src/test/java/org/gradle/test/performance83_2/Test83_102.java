package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_102 {
    private final Production83_102 production = new Production83_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
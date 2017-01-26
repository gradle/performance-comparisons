package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_238 {
    private final Production83_238 production = new Production83_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
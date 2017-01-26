package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_458 {
    private final Production83_458 production = new Production83_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
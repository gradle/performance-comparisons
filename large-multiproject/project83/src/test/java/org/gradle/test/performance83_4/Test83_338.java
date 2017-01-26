package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_338 {
    private final Production83_338 production = new Production83_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
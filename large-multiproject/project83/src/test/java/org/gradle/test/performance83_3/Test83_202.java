package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_202 {
    private final Production83_202 production = new Production83_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
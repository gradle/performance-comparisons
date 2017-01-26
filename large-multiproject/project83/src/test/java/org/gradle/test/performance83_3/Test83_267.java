package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_267 {
    private final Production83_267 production = new Production83_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
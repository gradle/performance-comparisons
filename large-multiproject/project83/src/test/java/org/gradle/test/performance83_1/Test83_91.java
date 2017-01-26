package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_91 {
    private final Production83_91 production = new Production83_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
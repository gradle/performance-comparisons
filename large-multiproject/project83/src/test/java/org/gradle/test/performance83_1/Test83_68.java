package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_68 {
    private final Production83_68 production = new Production83_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
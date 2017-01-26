package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_93 {
    private final Production83_93 production = new Production83_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
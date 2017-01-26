package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_88 {
    private final Production83_88 production = new Production83_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_388 {
    private final Production83_388 production = new Production83_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
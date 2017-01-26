package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_45 {
    private final Production83_45 production = new Production83_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
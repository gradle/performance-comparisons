package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_195 {
    private final Production83_195 production = new Production83_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
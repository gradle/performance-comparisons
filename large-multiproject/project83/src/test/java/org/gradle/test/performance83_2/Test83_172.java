package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_172 {
    private final Production83_172 production = new Production83_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_415 {
    private final Production83_415 production = new Production83_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
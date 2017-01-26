package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_166 {
    private final Production83_166 production = new Production83_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
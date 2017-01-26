package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_347 {
    private final Production83_347 production = new Production83_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
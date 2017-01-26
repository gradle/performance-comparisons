package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_325 {
    private final Production83_325 production = new Production83_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
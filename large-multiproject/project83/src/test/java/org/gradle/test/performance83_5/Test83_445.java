package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_445 {
    private final Production83_445 production = new Production83_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
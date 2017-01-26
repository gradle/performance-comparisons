package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_498 {
    private final Production83_498 production = new Production83_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
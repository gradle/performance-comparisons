package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_80 {
    private final Production83_80 production = new Production83_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
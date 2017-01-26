package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_225 {
    private final Production83_225 production = new Production83_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_99 {
    private final Production83_99 production = new Production83_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
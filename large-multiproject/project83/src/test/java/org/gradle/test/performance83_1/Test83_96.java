package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_96 {
    private final Production83_96 production = new Production83_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
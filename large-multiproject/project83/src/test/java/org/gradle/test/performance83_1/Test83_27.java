package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_27 {
    private final Production83_27 production = new Production83_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
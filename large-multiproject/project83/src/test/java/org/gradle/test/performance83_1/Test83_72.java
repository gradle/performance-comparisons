package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_72 {
    private final Production83_72 production = new Production83_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
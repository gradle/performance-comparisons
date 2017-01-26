package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_43 {
    private final Production83_43 production = new Production83_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
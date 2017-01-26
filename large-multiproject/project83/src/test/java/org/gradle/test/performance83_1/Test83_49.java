package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_49 {
    private final Production83_49 production = new Production83_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
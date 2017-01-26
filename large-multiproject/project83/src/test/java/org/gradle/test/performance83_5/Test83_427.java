package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_427 {
    private final Production83_427 production = new Production83_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
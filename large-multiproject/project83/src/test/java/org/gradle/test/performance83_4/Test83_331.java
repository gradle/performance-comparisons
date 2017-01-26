package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_331 {
    private final Production83_331 production = new Production83_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
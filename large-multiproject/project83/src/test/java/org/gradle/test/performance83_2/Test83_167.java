package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_167 {
    private final Production83_167 production = new Production83_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
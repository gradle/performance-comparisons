package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_255 {
    private final Production83_255 production = new Production83_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
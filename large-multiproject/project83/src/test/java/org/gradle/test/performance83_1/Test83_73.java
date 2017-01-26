package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_73 {
    private final Production83_73 production = new Production83_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
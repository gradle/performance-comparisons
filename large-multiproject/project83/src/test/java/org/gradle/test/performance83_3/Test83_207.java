package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_207 {
    private final Production83_207 production = new Production83_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
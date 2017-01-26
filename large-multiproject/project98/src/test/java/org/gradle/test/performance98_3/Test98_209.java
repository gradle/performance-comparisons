package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_209 {
    private final Production98_209 production = new Production98_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
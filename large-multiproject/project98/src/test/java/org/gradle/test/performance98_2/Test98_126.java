package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_126 {
    private final Production98_126 production = new Production98_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
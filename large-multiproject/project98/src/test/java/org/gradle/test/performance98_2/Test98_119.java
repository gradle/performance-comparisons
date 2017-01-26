package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_119 {
    private final Production98_119 production = new Production98_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_97 {
    private final Production98_97 production = new Production98_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
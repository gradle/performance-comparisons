package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_91 {
    private final Production98_91 production = new Production98_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
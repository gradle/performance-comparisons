package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_41 {
    private final Production98_41 production = new Production98_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
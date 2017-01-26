package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_44 {
    private final Production98_44 production = new Production98_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
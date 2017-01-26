package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_88 {
    private final Production98_88 production = new Production98_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
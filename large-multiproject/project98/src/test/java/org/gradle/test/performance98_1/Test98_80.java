package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_80 {
    private final Production98_80 production = new Production98_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
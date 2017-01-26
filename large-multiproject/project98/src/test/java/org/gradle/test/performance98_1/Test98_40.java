package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_40 {
    private final Production98_40 production = new Production98_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
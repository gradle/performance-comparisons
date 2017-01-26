package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_267 {
    private final Production98_267 production = new Production98_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
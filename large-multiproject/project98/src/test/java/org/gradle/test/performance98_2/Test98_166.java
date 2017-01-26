package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_166 {
    private final Production98_166 production = new Production98_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
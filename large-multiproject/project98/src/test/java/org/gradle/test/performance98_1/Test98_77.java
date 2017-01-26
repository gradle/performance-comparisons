package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_77 {
    private final Production98_77 production = new Production98_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
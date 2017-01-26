package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_445 {
    private final Production98_445 production = new Production98_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
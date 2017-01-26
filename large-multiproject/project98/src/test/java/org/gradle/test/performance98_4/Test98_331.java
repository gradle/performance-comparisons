package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_331 {
    private final Production98_331 production = new Production98_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
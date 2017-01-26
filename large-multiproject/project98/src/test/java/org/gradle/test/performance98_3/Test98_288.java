package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_288 {
    private final Production98_288 production = new Production98_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
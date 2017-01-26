package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_427 {
    private final Production98_427 production = new Production98_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
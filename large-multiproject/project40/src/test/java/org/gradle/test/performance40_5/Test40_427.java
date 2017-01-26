package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_427 {
    private final Production40_427 production = new Production40_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
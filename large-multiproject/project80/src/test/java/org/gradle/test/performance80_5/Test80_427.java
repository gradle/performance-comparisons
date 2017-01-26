package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_427 {
    private final Production80_427 production = new Production80_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
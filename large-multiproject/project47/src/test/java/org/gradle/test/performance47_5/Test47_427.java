package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_427 {
    private final Production47_427 production = new Production47_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
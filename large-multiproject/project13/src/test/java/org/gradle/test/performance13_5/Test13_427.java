package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_427 {
    private final Production13_427 production = new Production13_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
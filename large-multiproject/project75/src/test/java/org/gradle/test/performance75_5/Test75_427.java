package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_427 {
    private final Production75_427 production = new Production75_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
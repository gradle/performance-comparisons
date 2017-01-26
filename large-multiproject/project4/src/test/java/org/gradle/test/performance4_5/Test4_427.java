package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_427 {
    private final Production4_427 production = new Production4_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_427 {
    private final Production92_427 production = new Production92_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
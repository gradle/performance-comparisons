package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_427 {
    private final Production35_427 production = new Production35_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
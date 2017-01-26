package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_427 {
    private final Production31_427 production = new Production31_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
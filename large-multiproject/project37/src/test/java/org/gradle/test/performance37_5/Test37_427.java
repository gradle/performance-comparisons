package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_427 {
    private final Production37_427 production = new Production37_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
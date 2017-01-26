package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_350 {
    private final Production37_350 production = new Production37_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
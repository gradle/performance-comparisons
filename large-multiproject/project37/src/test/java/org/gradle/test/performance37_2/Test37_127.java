package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_127 {
    private final Production37_127 production = new Production37_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
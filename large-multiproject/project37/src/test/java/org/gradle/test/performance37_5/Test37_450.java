package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_450 {
    private final Production37_450 production = new Production37_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
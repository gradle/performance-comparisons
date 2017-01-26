package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_367 {
    private final Production37_367 production = new Production37_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
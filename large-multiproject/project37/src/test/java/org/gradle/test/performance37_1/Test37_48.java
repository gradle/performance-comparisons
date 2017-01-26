package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_48 {
    private final Production37_48 production = new Production37_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
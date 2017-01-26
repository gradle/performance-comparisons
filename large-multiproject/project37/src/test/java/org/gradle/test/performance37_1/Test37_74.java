package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_74 {
    private final Production37_74 production = new Production37_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
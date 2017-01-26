package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_220 {
    private final Production37_220 production = new Production37_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
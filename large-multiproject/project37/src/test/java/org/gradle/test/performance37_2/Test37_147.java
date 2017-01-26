package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_147 {
    private final Production37_147 production = new Production37_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
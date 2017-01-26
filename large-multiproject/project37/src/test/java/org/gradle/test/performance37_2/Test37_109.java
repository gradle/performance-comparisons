package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_109 {
    private final Production37_109 production = new Production37_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_134 {
    private final Production37_134 production = new Production37_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
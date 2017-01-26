package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_51 {
    private final Production37_51 production = new Production37_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
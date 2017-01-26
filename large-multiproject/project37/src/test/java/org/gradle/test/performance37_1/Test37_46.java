package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_46 {
    private final Production37_46 production = new Production37_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
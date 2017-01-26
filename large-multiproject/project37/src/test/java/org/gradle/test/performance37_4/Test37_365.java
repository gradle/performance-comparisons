package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_365 {
    private final Production37_365 production = new Production37_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
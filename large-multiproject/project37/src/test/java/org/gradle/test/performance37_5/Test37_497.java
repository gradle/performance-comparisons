package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_497 {
    private final Production37_497 production = new Production37_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
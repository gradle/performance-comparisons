package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_474 {
    private final Production37_474 production = new Production37_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
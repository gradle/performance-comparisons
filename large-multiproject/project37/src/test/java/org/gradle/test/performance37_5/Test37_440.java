package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_440 {
    private final Production37_440 production = new Production37_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_418 {
    private final Production37_418 production = new Production37_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
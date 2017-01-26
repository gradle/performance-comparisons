package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_154 {
    private final Production37_154 production = new Production37_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
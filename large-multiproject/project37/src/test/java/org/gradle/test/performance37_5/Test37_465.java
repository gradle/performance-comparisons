package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_465 {
    private final Production37_465 production = new Production37_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
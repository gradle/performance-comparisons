package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_337 {
    private final Production37_337 production = new Production37_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
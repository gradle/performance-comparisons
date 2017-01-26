package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_286 {
    private final Production37_286 production = new Production37_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
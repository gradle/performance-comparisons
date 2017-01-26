package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_323 {
    private final Production37_323 production = new Production37_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
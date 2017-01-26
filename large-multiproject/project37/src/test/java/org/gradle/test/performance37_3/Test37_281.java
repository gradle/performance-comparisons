package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_281 {
    private final Production37_281 production = new Production37_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_305 {
    private final Production37_305 production = new Production37_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
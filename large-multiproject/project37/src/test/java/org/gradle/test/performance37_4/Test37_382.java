package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_382 {
    private final Production37_382 production = new Production37_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
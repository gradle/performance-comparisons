package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_39 {
    private final Production37_39 production = new Production37_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
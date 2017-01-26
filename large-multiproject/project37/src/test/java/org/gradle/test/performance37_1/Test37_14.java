package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_14 {
    private final Production37_14 production = new Production37_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
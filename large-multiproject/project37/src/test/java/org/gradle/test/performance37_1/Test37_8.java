package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_8 {
    private final Production37_8 production = new Production37_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
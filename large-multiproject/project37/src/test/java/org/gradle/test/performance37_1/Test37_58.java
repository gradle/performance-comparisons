package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_58 {
    private final Production37_58 production = new Production37_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
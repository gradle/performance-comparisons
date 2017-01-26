package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_238 {
    private final Production37_238 production = new Production37_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
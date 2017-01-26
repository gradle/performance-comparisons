package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_138 {
    private final Production37_138 production = new Production37_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
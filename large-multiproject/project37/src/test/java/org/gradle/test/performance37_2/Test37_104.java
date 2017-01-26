package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_104 {
    private final Production37_104 production = new Production37_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
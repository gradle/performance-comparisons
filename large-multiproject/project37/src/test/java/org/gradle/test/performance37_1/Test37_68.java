package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_68 {
    private final Production37_68 production = new Production37_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
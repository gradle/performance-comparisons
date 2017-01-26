package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_2 {
    private final Production37_2 production = new Production37_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
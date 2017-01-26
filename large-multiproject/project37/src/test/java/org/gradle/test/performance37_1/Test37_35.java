package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_35 {
    private final Production37_35 production = new Production37_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
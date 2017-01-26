package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_200 {
    private final Production37_200 production = new Production37_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_500 {
    private final Production37_500 production = new Production37_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
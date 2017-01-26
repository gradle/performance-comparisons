package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_447 {
    private final Production37_447 production = new Production37_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
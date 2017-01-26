package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_415 {
    private final Production37_415 production = new Production37_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
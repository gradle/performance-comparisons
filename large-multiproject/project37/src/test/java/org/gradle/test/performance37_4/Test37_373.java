package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_373 {
    private final Production37_373 production = new Production37_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
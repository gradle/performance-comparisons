package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_422 {
    private final Production37_422 production = new Production37_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
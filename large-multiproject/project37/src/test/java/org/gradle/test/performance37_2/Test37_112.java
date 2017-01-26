package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_112 {
    private final Production37_112 production = new Production37_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
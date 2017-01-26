package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_246 {
    private final Production37_246 production = new Production37_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
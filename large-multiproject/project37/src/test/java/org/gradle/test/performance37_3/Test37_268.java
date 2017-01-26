package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_268 {
    private final Production37_268 production = new Production37_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
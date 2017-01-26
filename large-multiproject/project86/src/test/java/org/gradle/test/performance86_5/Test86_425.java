package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_425 {
    private final Production86_425 production = new Production86_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
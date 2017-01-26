package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_495 {
    private final Production37_495 production = new Production37_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
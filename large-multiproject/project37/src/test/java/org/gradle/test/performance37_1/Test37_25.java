package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_25 {
    private final Production37_25 production = new Production37_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
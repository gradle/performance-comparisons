package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_28 {
    private final Production37_28 production = new Production37_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
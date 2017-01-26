package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_38 {
    private final Production37_38 production = new Production37_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
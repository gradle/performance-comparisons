package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_41 {
    private final Production37_41 production = new Production37_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
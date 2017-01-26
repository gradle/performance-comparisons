package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_9 {
    private final Production37_9 production = new Production37_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
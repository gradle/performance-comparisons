package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_3 {
    private final Production37_3 production = new Production37_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
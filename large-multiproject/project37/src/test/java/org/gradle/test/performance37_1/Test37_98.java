package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_98 {
    private final Production37_98 production = new Production37_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_137 {
    private final Production37_137 production = new Production37_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
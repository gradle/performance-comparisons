package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_168 {
    private final Production37_168 production = new Production37_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_228 {
    private final Production37_228 production = new Production37_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
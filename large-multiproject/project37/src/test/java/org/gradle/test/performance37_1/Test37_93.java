package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_93 {
    private final Production37_93 production = new Production37_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
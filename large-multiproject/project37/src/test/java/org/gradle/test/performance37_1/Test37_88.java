package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_88 {
    private final Production37_88 production = new Production37_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
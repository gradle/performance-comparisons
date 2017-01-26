package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_80 {
    private final Production37_80 production = new Production37_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
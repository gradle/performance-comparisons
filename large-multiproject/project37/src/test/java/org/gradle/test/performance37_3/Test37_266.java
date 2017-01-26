package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_266 {
    private final Production37_266 production = new Production37_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
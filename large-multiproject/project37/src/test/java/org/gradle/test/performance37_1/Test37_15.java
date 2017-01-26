package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_15 {
    private final Production37_15 production = new Production37_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
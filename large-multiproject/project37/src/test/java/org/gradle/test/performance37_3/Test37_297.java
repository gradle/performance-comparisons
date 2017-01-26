package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_297 {
    private final Production37_297 production = new Production37_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
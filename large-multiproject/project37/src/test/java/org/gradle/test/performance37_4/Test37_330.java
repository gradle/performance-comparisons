package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_330 {
    private final Production37_330 production = new Production37_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
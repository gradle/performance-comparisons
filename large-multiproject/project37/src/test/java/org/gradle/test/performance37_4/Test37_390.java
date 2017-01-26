package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_390 {
    private final Production37_390 production = new Production37_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
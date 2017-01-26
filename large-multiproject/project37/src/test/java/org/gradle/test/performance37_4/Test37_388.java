package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_388 {
    private final Production37_388 production = new Production37_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
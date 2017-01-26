package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_379 {
    private final Production7_379 production = new Production7_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
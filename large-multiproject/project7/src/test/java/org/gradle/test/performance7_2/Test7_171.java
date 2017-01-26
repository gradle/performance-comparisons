package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_171 {
    private final Production7_171 production = new Production7_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
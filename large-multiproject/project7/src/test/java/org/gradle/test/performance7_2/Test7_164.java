package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_164 {
    private final Production7_164 production = new Production7_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
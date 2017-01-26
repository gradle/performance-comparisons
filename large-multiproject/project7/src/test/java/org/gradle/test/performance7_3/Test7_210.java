package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_210 {
    private final Production7_210 production = new Production7_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
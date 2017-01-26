package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_307 {
    private final Production7_307 production = new Production7_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
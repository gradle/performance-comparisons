package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_343 {
    private final Production7_343 production = new Production7_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
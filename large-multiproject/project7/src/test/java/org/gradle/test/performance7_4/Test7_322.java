package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_322 {
    private final Production7_322 production = new Production7_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
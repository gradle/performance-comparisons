package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_304 {
    private final Production7_304 production = new Production7_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
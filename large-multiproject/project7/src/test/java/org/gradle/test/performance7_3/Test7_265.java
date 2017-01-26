package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_265 {
    private final Production7_265 production = new Production7_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
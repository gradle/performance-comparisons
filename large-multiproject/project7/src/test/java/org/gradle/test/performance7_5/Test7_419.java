package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_419 {
    private final Production7_419 production = new Production7_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
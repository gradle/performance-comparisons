package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_435 {
    private final Production7_435 production = new Production7_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
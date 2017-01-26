package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_435 {
    private final Production30_435 production = new Production30_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
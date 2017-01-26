package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_419 {
    private final Production30_419 production = new Production30_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_322 {
    private final Production30_322 production = new Production30_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
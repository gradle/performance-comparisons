package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_313 {
    private final Production30_313 production = new Production30_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
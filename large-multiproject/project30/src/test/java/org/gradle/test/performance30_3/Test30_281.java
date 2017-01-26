package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_281 {
    private final Production30_281 production = new Production30_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
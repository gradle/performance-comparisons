package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_150 {
    private final Production30_150 production = new Production30_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
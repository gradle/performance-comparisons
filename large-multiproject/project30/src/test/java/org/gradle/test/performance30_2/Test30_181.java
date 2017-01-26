package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_181 {
    private final Production30_181 production = new Production30_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_168 {
    private final Production30_168 production = new Production30_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
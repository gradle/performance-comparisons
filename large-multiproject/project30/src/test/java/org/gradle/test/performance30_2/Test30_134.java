package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_134 {
    private final Production30_134 production = new Production30_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
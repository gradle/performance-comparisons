package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_61 {
    private final Production30_61 production = new Production30_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
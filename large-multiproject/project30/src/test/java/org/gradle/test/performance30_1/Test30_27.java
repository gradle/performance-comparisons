package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_27 {
    private final Production30_27 production = new Production30_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
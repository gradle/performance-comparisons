package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_458 {
    private final Production30_458 production = new Production30_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
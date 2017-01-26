package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_259 {
    private final Production30_259 production = new Production30_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
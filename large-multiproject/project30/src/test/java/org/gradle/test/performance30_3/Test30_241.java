package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_241 {
    private final Production30_241 production = new Production30_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
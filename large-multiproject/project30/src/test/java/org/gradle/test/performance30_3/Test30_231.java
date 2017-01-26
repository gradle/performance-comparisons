package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_231 {
    private final Production30_231 production = new Production30_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
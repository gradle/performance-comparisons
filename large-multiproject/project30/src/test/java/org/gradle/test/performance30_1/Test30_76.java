package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_76 {
    private final Production30_76 production = new Production30_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
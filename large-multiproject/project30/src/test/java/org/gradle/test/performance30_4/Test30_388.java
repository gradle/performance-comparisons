package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_388 {
    private final Production30_388 production = new Production30_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
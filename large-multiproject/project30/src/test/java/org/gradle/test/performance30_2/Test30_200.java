package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_200 {
    private final Production30_200 production = new Production30_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
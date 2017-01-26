package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_390 {
    private final Production30_390 production = new Production30_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
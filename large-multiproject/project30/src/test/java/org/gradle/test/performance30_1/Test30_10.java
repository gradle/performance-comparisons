package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_10 {
    private final Production30_10 production = new Production30_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
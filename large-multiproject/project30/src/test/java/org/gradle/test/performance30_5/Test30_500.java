package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_500 {
    private final Production30_500 production = new Production30_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
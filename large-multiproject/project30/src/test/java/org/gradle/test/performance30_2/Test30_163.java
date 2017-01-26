package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_163 {
    private final Production30_163 production = new Production30_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
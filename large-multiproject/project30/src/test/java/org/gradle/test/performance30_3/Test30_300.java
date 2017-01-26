package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_300 {
    private final Production30_300 production = new Production30_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
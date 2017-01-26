package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_238 {
    private final Production30_238 production = new Production30_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
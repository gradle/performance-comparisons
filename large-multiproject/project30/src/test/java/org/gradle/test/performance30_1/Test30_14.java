package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_14 {
    private final Production30_14 production = new Production30_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
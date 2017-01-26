package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_39 {
    private final Production30_39 production = new Production30_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_325 {
    private final Production30_325 production = new Production30_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
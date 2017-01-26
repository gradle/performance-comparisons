package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_72 {
    private final Production30_72 production = new Production30_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
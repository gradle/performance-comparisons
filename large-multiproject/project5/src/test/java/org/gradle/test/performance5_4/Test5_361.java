package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_361 {
    private final Production5_361 production = new Production5_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
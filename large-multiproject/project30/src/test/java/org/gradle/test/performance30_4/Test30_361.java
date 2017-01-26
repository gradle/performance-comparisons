package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_361 {
    private final Production30_361 production = new Production30_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
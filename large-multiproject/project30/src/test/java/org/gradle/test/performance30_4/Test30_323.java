package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_323 {
    private final Production30_323 production = new Production30_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
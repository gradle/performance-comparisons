package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_323 {
    private final Production3_323 production = new Production3_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
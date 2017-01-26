package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_437 {
    private final Production3_437 production = new Production3_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
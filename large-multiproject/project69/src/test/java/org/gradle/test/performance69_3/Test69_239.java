package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_239 {
    private final Production69_239 production = new Production69_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_251 {
    private final Production69_251 production = new Production69_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
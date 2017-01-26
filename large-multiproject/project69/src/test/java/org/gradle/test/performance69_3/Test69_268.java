package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_268 {
    private final Production69_268 production = new Production69_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
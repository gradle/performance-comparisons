package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_392 {
    private final Production69_392 production = new Production69_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_3 {
    private final Production69_3 production = new Production69_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
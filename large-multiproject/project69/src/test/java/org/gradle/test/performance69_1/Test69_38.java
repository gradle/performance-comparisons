package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_38 {
    private final Production69_38 production = new Production69_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
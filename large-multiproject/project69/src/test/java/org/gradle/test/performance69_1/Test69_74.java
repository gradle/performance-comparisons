package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_74 {
    private final Production69_74 production = new Production69_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_293 {
    private final Production69_293 production = new Production69_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
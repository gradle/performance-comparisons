package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_315 {
    private final Production69_315 production = new Production69_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
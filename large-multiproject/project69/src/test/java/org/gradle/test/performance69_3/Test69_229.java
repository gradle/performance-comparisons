package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_229 {
    private final Production69_229 production = new Production69_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_289 {
    private final Production69_289 production = new Production69_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
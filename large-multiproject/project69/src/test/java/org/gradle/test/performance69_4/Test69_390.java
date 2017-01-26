package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_390 {
    private final Production69_390 production = new Production69_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
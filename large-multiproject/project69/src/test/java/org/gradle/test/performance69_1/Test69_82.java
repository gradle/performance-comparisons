package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_82 {
    private final Production69_82 production = new Production69_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
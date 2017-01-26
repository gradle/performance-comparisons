package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_297 {
    private final Production69_297 production = new Production69_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
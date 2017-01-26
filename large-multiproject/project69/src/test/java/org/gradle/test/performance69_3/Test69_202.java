package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_202 {
    private final Production69_202 production = new Production69_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
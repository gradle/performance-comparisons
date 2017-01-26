package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_288 {
    private final Production69_288 production = new Production69_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
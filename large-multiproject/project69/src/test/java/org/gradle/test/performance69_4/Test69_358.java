package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_358 {
    private final Production69_358 production = new Production69_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
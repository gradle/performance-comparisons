package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_40 {
    private final Production69_40 production = new Production69_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
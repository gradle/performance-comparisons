package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_195 {
    private final Production69_195 production = new Production69_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
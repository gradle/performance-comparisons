package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_200 {
    private final Production69_200 production = new Production69_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
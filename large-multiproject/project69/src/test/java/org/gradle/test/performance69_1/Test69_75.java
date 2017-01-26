package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_75 {
    private final Production69_75 production = new Production69_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
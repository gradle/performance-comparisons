package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_27 {
    private final Production69_27 production = new Production69_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
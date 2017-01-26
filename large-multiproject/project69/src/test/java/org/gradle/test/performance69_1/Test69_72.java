package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_72 {
    private final Production69_72 production = new Production69_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
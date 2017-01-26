package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_356 {
    private final Production69_356 production = new Production69_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
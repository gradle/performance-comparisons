package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_89 {
    private final Production69_89 production = new Production69_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
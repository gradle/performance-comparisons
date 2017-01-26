package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_68 {
    private final Production69_68 production = new Production69_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
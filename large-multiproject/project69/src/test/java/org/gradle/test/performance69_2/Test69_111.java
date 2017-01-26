package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_111 {
    private final Production69_111 production = new Production69_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
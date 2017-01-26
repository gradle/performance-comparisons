package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_107 {
    private final Production69_107 production = new Production69_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
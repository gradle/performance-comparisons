package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_199 {
    private final Production69_199 production = new Production69_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
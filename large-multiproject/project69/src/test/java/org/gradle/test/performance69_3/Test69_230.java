package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_230 {
    private final Production69_230 production = new Production69_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
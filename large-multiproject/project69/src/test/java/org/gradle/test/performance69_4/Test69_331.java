package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_331 {
    private final Production69_331 production = new Production69_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
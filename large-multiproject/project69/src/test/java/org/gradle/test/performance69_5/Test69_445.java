package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_445 {
    private final Production69_445 production = new Production69_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
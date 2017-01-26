package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_432 {
    private final Production69_432 production = new Production69_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
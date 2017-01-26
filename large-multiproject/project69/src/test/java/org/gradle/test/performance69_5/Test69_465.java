package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_465 {
    private final Production69_465 production = new Production69_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
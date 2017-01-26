package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_495 {
    private final Production69_495 production = new Production69_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
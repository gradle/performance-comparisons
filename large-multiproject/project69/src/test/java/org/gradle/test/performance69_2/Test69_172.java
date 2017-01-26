package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_172 {
    private final Production69_172 production = new Production69_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
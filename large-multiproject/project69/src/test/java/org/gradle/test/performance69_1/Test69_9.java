package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_9 {
    private final Production69_9 production = new Production69_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
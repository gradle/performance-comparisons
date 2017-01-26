package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_100 {
    private final Production69_100 production = new Production69_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
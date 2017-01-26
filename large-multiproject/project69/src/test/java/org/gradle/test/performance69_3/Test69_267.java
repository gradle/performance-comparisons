package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_267 {
    private final Production69_267 production = new Production69_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
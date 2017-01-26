package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_338 {
    private final Production69_338 production = new Production69_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
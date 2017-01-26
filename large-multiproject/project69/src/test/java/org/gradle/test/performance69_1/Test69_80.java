package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_80 {
    private final Production69_80 production = new Production69_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
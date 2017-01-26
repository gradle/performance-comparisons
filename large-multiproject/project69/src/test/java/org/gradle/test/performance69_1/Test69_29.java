package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_29 {
    private final Production69_29 production = new Production69_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
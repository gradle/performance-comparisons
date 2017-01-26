package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_77 {
    private final Production69_77 production = new Production69_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
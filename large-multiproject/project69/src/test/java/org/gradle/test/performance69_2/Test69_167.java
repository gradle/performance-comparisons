package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_167 {
    private final Production69_167 production = new Production69_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
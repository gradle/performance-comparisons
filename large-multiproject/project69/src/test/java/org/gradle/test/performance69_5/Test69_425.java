package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_425 {
    private final Production69_425 production = new Production69_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
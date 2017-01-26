package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_214 {
    private final Production69_214 production = new Production69_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_294 {
    private final Production69_294 production = new Production69_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
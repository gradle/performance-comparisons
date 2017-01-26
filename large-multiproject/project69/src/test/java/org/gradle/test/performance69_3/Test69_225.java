package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_225 {
    private final Production69_225 production = new Production69_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
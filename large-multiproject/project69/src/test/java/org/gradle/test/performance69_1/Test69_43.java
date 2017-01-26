package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_43 {
    private final Production69_43 production = new Production69_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
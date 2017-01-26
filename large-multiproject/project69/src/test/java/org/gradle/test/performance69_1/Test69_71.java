package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_71 {
    private final Production69_71 production = new Production69_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
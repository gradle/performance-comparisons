package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_209 {
    private final Production69_209 production = new Production69_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
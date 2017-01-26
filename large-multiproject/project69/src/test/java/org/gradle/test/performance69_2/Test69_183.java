package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_183 {
    private final Production69_183 production = new Production69_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
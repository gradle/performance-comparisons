package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_190 {
    private final Production45_190 production = new Production45_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
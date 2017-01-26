package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_176 {
    private final Production45_176 production = new Production45_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_182 {
    private final Production45_182 production = new Production45_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
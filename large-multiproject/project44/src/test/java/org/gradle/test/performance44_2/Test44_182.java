package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_182 {
    private final Production44_182 production = new Production44_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_182 {
    private final Production73_182 production = new Production73_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_182 {
    private final Production27_182 production = new Production27_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
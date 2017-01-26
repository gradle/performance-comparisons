package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_182 {
    private final Production95_182 production = new Production95_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
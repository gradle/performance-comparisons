package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_19 {
    private final Production95_19 production = new Production95_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
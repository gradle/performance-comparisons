package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_18 {
    private final Production95_18 production = new Production95_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
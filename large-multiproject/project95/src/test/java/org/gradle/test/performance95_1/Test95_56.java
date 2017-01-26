package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_56 {
    private final Production95_56 production = new Production95_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
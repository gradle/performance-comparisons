package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_242 {
    private final Production95_242 production = new Production95_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_492 {
    private final Production95_492 production = new Production95_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
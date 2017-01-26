package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_192 {
    private final Production95_192 production = new Production95_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
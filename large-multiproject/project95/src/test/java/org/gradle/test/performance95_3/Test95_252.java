package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_252 {
    private final Production95_252 production = new Production95_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
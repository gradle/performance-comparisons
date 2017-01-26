package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_193 {
    private final Production95_193 production = new Production95_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
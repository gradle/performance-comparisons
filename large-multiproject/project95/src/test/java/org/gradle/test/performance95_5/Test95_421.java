package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_421 {
    private final Production95_421 production = new Production95_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
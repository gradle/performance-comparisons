package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_400 {
    private final Production95_400 production = new Production95_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
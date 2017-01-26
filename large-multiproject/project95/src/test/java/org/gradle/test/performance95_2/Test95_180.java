package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_180 {
    private final Production95_180 production = new Production95_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_452 {
    private final Production95_452 production = new Production95_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
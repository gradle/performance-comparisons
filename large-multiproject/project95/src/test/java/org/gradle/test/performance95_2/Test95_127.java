package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_127 {
    private final Production95_127 production = new Production95_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
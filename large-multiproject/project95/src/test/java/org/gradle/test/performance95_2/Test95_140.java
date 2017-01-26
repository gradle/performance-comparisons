package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_140 {
    private final Production95_140 production = new Production95_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
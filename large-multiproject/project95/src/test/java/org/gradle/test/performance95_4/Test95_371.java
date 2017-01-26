package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_371 {
    private final Production95_371 production = new Production95_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
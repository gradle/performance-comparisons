package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_354 {
    private final Production95_354 production = new Production95_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
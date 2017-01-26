package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_469 {
    private final Production95_469 production = new Production95_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
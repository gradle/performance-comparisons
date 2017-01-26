package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_471 {
    private final Production95_471 production = new Production95_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
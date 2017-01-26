package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_455 {
    private final Production95_455 production = new Production95_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
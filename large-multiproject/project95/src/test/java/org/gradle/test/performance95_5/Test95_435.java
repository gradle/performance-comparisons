package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_435 {
    private final Production95_435 production = new Production95_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
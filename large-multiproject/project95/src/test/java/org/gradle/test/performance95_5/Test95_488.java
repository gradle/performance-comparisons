package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_488 {
    private final Production95_488 production = new Production95_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
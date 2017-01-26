package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_468 {
    private final Production95_468 production = new Production95_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
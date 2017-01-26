package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_343 {
    private final Production95_343 production = new Production95_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
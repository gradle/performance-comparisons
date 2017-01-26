package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_395 {
    private final Production95_395 production = new Production95_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
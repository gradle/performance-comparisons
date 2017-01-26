package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_158 {
    private final Production95_158 production = new Production95_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
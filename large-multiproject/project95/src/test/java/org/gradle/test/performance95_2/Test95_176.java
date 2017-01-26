package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_176 {
    private final Production95_176 production = new Production95_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
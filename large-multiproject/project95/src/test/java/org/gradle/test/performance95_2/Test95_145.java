package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_145 {
    private final Production95_145 production = new Production95_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_174 {
    private final Production95_174 production = new Production95_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
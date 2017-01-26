package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_191 {
    private final Production95_191 production = new Production95_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
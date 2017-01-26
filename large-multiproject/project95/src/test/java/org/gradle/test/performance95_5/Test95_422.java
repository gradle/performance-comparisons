package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_422 {
    private final Production95_422 production = new Production95_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
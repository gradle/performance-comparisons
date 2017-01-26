package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_313 {
    private final Production95_313 production = new Production95_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
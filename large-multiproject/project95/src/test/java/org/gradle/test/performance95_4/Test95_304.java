package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_304 {
    private final Production95_304 production = new Production95_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
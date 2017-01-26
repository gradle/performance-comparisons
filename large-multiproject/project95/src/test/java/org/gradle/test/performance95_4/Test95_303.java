package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_303 {
    private final Production95_303 production = new Production95_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
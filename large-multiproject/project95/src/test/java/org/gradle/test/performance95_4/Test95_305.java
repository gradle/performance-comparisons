package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_305 {
    private final Production95_305 production = new Production95_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
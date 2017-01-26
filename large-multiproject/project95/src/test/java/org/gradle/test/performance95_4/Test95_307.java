package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_307 {
    private final Production95_307 production = new Production95_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
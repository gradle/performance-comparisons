package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_404 {
    private final Production95_404 production = new Production95_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
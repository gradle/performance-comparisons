package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_377 {
    private final Production95_377 production = new Production95_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
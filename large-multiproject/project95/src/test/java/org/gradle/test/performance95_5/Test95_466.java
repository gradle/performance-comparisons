package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_466 {
    private final Production95_466 production = new Production95_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
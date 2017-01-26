package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_418 {
    private final Production95_418 production = new Production95_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
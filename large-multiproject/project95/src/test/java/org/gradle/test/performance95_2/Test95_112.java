package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_112 {
    private final Production95_112 production = new Production95_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
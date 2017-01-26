package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_268 {
    private final Production95_268 production = new Production95_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
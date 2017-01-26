package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_246 {
    private final Production95_246 production = new Production95_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
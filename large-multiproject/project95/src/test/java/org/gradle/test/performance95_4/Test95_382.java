package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_382 {
    private final Production95_382 production = new Production95_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
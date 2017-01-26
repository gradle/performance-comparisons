package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_270 {
    private final Production95_270 production = new Production95_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
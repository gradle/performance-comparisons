package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_322 {
    private final Production95_322 production = new Production95_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_419 {
    private final Production95_419 production = new Production95_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
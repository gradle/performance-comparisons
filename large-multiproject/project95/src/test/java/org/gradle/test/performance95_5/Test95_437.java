package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_437 {
    private final Production95_437 production = new Production95_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
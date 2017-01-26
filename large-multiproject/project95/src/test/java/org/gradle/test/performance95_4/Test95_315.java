package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_315 {
    private final Production95_315 production = new Production95_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
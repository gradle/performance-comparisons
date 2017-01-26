package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_293 {
    private final Production95_293 production = new Production95_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
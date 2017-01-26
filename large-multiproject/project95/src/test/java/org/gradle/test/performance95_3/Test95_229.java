package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_229 {
    private final Production95_229 production = new Production95_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_135 {
    private final Production95_135 production = new Production95_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
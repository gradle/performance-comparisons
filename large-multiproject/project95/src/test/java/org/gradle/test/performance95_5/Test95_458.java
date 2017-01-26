package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_458 {
    private final Production95_458 production = new Production95_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
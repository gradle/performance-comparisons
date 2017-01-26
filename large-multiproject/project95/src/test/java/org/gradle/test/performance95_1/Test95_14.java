package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_14 {
    private final Production95_14 production = new Production95_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
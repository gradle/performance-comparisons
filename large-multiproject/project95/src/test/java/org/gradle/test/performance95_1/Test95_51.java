package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_51 {
    private final Production95_51 production = new Production95_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
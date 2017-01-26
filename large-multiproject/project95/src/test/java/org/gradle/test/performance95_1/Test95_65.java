package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_65 {
    private final Production95_65 production = new Production95_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
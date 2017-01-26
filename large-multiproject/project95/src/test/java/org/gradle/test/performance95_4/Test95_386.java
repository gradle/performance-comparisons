package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_386 {
    private final Production95_386 production = new Production95_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
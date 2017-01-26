package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_361 {
    private final Production95_361 production = new Production95_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_415 {
    private final Production95_415 production = new Production95_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
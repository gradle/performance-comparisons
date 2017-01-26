package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_173 {
    private final Production95_173 production = new Production95_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
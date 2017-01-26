package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_227 {
    private final Production95_227 production = new Production95_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_189 {
    private final Production95_189 production = new Production95_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
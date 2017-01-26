package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_227 {
    private final Production72_227 production = new Production72_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
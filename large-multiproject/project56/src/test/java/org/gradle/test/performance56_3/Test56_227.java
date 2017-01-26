package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_227 {
    private final Production56_227 production = new Production56_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
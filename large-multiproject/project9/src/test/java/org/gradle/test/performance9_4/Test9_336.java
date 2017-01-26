package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_336 {
    private final Production9_336 production = new Production9_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
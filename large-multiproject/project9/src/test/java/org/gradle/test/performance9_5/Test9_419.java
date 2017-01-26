package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_419 {
    private final Production9_419 production = new Production9_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
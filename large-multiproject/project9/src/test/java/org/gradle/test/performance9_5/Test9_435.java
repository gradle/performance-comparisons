package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_435 {
    private final Production9_435 production = new Production9_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
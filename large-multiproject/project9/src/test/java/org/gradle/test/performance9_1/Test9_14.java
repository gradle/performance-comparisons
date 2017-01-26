package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_14 {
    private final Production9_14 production = new Production9_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
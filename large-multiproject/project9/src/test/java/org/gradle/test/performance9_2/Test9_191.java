package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_191 {
    private final Production9_191 production = new Production9_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
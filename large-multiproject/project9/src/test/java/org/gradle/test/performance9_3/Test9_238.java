package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_238 {
    private final Production9_238 production = new Production9_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_395 {
    private final Production9_395 production = new Production9_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_382 {
    private final Production9_382 production = new Production9_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
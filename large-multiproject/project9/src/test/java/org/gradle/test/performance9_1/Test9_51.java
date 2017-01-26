package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_51 {
    private final Production9_51 production = new Production9_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
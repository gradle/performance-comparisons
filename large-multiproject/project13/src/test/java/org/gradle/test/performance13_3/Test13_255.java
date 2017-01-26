package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_255 {
    private final Production13_255 production = new Production13_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
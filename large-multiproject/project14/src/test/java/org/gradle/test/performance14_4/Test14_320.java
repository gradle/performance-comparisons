package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_320 {
    private final Production14_320 production = new Production14_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
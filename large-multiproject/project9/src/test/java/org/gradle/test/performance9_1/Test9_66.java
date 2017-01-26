package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_66 {
    private final Production9_66 production = new Production9_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
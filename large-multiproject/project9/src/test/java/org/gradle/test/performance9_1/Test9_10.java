package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_10 {
    private final Production9_10 production = new Production9_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
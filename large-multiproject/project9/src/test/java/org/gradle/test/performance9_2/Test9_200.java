package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_200 {
    private final Production9_200 production = new Production9_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
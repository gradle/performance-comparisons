package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_388 {
    private final Production9_388 production = new Production9_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
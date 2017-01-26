package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_390 {
    private final Production9_390 production = new Production9_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_2 {
    private final Production9_2 production = new Production9_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
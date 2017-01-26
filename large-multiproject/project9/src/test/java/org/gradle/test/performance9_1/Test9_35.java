package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_35 {
    private final Production9_35 production = new Production9_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
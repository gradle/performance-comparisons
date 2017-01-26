package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_3 {
    private final Production9_3 production = new Production9_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
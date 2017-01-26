package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_46 {
    private final Production9_46 production = new Production9_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
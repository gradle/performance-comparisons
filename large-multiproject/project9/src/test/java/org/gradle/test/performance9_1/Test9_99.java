package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_99 {
    private final Production9_99 production = new Production9_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
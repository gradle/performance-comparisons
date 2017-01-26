package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_96 {
    private final Production9_96 production = new Production9_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
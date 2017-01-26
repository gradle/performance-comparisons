package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_168 {
    private final Production9_168 production = new Production9_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
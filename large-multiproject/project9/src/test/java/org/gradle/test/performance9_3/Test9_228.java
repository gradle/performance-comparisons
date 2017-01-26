package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_228 {
    private final Production9_228 production = new Production9_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
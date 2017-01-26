package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_90 {
    private final Production9_90 production = new Production9_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
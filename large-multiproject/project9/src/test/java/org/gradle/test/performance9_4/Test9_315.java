package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_315 {
    private final Production9_315 production = new Production9_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
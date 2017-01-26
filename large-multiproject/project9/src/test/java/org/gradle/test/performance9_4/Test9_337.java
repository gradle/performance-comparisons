package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_337 {
    private final Production9_337 production = new Production9_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
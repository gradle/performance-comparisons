package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_281 {
    private final Production9_281 production = new Production9_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
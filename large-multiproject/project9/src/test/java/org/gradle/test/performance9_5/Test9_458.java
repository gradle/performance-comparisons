package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_458 {
    private final Production9_458 production = new Production9_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
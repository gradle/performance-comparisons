package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_495 {
    private final Production9_495 production = new Production9_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
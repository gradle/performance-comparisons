package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_415 {
    private final Production9_415 production = new Production9_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_325 {
    private final Production9_325 production = new Production9_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
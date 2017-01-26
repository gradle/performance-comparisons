package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_267 {
    private final Production9_267 production = new Production9_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
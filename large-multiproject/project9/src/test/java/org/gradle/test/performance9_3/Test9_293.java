package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_293 {
    private final Production9_293 production = new Production9_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
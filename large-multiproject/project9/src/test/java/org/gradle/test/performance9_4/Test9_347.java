package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_347 {
    private final Production9_347 production = new Production9_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_74 {
    private final Production9_74 production = new Production9_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
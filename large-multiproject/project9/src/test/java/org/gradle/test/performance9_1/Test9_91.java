package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_91 {
    private final Production9_91 production = new Production9_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
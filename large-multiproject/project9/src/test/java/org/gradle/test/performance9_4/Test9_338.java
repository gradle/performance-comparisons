package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_338 {
    private final Production9_338 production = new Production9_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
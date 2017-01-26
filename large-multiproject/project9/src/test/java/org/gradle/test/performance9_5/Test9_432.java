package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_432 {
    private final Production9_432 production = new Production9_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
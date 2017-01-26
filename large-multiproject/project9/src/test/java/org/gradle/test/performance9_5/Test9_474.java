package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_474 {
    private final Production9_474 production = new Production9_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
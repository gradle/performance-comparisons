package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_461 {
    private final Production9_461 production = new Production9_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
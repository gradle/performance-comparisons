package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_288 {
    private final Production9_288 production = new Production9_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
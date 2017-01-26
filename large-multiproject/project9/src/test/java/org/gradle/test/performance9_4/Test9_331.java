package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_331 {
    private final Production9_331 production = new Production9_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
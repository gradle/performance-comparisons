package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_445 {
    private final Production9_445 production = new Production9_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_255 {
    private final Production9_255 production = new Production9_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
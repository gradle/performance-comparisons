package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_255 {
    private final Production67_255 production = new Production67_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
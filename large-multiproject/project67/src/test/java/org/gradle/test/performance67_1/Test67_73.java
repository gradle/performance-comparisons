package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_73 {
    private final Production67_73 production = new Production67_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
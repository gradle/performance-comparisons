package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_251 {
    private final Production9_251 production = new Production9_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
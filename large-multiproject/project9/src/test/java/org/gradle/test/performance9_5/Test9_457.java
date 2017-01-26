package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_457 {
    private final Production9_457 production = new Production9_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
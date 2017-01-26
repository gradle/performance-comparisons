package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_427 {
    private final Production67_427 production = new Production67_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
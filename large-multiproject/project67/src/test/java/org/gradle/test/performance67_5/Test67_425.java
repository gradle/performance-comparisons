package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_425 {
    private final Production67_425 production = new Production67_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
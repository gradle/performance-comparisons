package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_49 {
    private final Production67_49 production = new Production67_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_129 {
    private final Production19_129 production = new Production19_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
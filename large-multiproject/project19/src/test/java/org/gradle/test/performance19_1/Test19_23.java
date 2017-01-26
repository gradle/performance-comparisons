package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_23 {
    private final Production19_23 production = new Production19_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
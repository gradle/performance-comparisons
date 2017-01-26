package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_94 {
    private final Production19_94 production = new Production19_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
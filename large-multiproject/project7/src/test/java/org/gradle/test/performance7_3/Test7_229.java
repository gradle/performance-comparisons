package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_229 {
    private final Production7_229 production = new Production7_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
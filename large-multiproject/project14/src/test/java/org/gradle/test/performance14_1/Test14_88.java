package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_88 {
    private final Production14_88 production = new Production14_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
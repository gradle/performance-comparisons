package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_297 {
    private final Production14_297 production = new Production14_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
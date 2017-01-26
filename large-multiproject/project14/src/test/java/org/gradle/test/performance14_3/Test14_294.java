package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_294 {
    private final Production14_294 production = new Production14_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
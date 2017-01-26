package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_331 {
    private final Production14_331 production = new Production14_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
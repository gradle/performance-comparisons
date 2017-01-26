package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_288 {
    private final Production14_288 production = new Production14_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
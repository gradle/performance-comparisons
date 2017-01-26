package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_93 {
    private final Production14_93 production = new Production14_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
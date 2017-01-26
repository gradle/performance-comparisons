package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_96 {
    private final Production14_96 production = new Production14_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
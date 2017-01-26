package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_166 {
    private final Production7_166 production = new Production7_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
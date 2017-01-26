package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_166 {
    private final Production30_166 production = new Production30_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
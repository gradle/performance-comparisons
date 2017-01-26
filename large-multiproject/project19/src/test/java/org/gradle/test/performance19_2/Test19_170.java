package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_170 {
    private final Production19_170 production = new Production19_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
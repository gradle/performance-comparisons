package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_166 {
    private final Production99_166 production = new Production99_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
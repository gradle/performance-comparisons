package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_166 {
    private final Production90_166 production = new Production90_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
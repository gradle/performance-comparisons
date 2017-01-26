package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_66 {
    private final Production90_66 production = new Production90_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
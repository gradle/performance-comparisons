package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_134 {
    private final Production90_134 production = new Production90_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_3 {
    private final Production90_3 production = new Production90_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
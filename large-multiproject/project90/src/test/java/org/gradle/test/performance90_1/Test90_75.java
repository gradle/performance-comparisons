package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_75 {
    private final Production90_75 production = new Production90_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_157 {
    private final Production90_157 production = new Production90_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
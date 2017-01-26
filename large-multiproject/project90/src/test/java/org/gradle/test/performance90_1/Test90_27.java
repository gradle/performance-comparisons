package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_27 {
    private final Production90_27 production = new Production90_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
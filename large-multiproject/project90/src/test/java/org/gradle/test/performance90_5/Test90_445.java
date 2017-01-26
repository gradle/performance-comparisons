package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_445 {
    private final Production90_445 production = new Production90_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
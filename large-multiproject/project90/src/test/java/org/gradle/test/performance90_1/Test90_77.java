package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_77 {
    private final Production90_77 production = new Production90_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_68 {
    private final Production90_68 production = new Production90_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
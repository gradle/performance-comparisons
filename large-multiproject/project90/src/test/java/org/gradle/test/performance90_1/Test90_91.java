package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_91 {
    private final Production90_91 production = new Production90_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
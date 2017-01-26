package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_41 {
    private final Production90_41 production = new Production90_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
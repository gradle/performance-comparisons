package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_38 {
    private final Production90_38 production = new Production90_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
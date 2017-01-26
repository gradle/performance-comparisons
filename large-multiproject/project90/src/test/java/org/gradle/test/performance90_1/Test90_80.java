package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_80 {
    private final Production90_80 production = new Production90_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_88 {
    private final Production90_88 production = new Production90_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
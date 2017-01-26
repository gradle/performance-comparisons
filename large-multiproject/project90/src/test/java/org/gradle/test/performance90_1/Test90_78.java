package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_78 {
    private final Production90_78 production = new Production90_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
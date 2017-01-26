package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_72 {
    private final Production90_72 production = new Production90_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
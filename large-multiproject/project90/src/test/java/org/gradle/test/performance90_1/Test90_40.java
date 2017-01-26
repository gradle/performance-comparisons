package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_40 {
    private final Production90_40 production = new Production90_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_325 {
    private final Production90_325 production = new Production90_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_267 {
    private final Production90_267 production = new Production90_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
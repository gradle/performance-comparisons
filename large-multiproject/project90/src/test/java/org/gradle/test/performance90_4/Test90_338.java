package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_338 {
    private final Production90_338 production = new Production90_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
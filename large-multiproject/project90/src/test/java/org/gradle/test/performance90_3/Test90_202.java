package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_202 {
    private final Production90_202 production = new Production90_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
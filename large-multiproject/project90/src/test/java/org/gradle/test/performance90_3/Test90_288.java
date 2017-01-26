package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_288 {
    private final Production90_288 production = new Production90_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
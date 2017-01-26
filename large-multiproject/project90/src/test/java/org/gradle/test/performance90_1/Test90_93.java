package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_93 {
    private final Production90_93 production = new Production90_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
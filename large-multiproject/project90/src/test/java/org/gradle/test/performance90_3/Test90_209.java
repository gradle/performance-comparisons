package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_209 {
    private final Production90_209 production = new Production90_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_297 {
    private final Production90_297 production = new Production90_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
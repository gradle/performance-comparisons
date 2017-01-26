package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_294 {
    private final Production90_294 production = new Production90_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
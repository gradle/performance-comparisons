package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_44 {
    private final Production90_44 production = new Production90_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
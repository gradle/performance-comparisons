package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_225 {
    private final Production90_225 production = new Production90_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
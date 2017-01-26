package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_229 {
    private final Production90_229 production = new Production90_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
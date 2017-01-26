package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_43 {
    private final Production90_43 production = new Production90_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_347 {
    private final Production90_347 production = new Production90_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_484 {
    private final Production91_484 production = new Production91_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
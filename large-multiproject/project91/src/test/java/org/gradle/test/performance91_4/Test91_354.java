package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_354 {
    private final Production91_354 production = new Production91_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
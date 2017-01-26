package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_377 {
    private final Production91_377 production = new Production91_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
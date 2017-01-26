package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_440 {
    private final Production91_440 production = new Production91_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
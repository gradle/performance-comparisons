package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_468 {
    private final Production91_468 production = new Production91_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
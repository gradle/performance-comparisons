package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_371 {
    private final Production91_371 production = new Production91_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_395 {
    private final Production91_395 production = new Production91_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
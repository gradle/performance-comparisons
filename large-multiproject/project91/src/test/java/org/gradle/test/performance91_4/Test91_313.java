package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_313 {
    private final Production91_313 production = new Production91_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
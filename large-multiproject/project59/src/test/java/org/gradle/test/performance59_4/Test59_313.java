package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_313 {
    private final Production59_313 production = new Production59_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_89 {
    private final Production91_89 production = new Production91_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
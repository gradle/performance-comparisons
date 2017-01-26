package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_322 {
    private final Production91_322 production = new Production91_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_304 {
    private final Production91_304 production = new Production91_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
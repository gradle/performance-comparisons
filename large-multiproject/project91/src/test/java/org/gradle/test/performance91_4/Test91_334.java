package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_334 {
    private final Production91_334 production = new Production91_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
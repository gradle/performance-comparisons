package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_302 {
    private final Production91_302 production = new Production91_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
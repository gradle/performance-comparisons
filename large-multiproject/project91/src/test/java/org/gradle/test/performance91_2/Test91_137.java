package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_137 {
    private final Production91_137 production = new Production91_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_191 {
    private final Production91_191 production = new Production91_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
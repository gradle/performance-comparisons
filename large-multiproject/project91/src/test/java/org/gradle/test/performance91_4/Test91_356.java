package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_356 {
    private final Production91_356 production = new Production91_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
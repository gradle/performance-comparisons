package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_422 {
    private final Production91_422 production = new Production91_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
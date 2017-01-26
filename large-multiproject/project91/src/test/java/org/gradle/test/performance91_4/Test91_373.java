package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_373 {
    private final Production91_373 production = new Production91_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
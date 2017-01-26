package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_163 {
    private final Production91_163 production = new Production91_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
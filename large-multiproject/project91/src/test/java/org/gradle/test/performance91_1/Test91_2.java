package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_2 {
    private final Production91_2 production = new Production91_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
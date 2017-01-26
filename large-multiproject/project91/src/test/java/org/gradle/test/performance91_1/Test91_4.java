package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_4 {
    private final Production91_4 production = new Production91_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
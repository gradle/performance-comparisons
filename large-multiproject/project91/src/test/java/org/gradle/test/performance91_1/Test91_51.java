package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_51 {
    private final Production91_51 production = new Production91_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
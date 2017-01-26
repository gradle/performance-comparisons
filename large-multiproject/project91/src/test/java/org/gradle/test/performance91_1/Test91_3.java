package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_3 {
    private final Production91_3 production = new Production91_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
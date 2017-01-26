package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_25 {
    private final Production91_25 production = new Production91_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
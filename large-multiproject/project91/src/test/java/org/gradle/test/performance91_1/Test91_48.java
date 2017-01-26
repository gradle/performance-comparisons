package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_48 {
    private final Production91_48 production = new Production91_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
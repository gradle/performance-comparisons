package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_471 {
    private final Production91_471 production = new Production91_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
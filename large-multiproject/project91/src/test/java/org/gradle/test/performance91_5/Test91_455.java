package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_455 {
    private final Production91_455 production = new Production91_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
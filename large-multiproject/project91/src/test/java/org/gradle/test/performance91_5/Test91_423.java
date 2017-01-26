package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_423 {
    private final Production91_423 production = new Production91_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
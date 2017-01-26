package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_270 {
    private final Production91_270 production = new Production91_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
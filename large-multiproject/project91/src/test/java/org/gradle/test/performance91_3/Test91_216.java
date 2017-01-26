package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_216 {
    private final Production91_216 production = new Production91_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
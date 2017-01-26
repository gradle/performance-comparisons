package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_229 {
    private final Production91_229 production = new Production91_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
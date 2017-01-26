package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_29 {
    private final Production91_29 production = new Production91_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
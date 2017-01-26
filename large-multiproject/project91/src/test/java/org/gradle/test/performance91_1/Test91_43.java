package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_43 {
    private final Production91_43 production = new Production91_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
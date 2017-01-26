package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_43 {
    private final Production59_43 production = new Production59_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
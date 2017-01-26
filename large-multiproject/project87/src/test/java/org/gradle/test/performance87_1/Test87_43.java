package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_43 {
    private final Production87_43 production = new Production87_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}